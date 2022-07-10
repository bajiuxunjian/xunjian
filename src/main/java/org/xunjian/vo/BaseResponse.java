package org.xunjian.vo;

import static org.xunjian.vo.BaseResponse.BaseResponseCodeEnum.SUCCESS;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author xiangshuai
 * @date 2021/2/23
 */
@ApiModel(description = "响应结果")
@Accessors(chain = true)
@Data
public class BaseResponse<T> {
    @ApiModelProperty(value = "状态码，仅SUCCESS时正常", example = "SUCCESS" )
    private String code;
    @ApiModelProperty(value = "消息")
    private String message;
    @ApiModelProperty(value = "响应数据")
    private T data;

    public static <T> BaseResponse<T> success(T data) {
        BaseResponse<T> baseResponse = new BaseResponse<T>();
        baseResponse.setCode(SUCCESS.name());
        baseResponse.setData(data);
        return baseResponse;
    }

    public static BaseResponse success() {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(SUCCESS.name());
        return baseResponse;
    }

    public static BaseResponse error(BaseResponseCodeEnum baseResponseCodeEnum, String message) {
        return new BaseResponse().setCode(baseResponseCodeEnum.name()).setMessage(message);
    }

    public static BaseResponse error(BaseResponseCodeEnum baseResponseCodeEnum) {
        return new BaseResponse().setCode(baseResponseCodeEnum.name()).setMessage(baseResponseCodeEnum.message);
    }

    public enum BaseResponseCodeEnum {
        SUCCESS("成功"),
        INVALID_VERSION("版本不一致"),
        INVALID_REQUEST("错误请求"),
        INTERNAL_ERROR("服务异常"),
        NOT_FOUND_TYPE("分组或配置项类型不存在"),

        /**
         * 系统类响应
         */
        SYS_ERR("系统错误"),
        SYS_DB_CONN("数据库连接失败"),
        SYS_UNA("服务不可用"),
        SYS_DEGRADE("服务降级"),

        /**
         * 客户端类响应
         */
        CLI_PARAM_ILLEGAL("参数非法"),
        CLI_IDENTIFY_CODE_ILLEGAL("验证码非法"),
        CLI_ID_NOTNULL("ID不能为空"),
        CLI_DELETE_ILLEGAL("无效的删除对象，请继承DeleteEntity"),

        /**
         * 业务类型
         */
        DATA_NOT_FOUND("数据不存在"),
        USER_OR_PASSWORD_ERROR("用户名或密码错误"),
        BASIC_TYPE_ERROR("数据类型错误"),

        REQUEST_ILLEGAL("非法请求"),
        VertexNodeCostNotComputeFinish("顶节点直接成本还没有计算完成"),
        NotCanComputeIndirectCost("此关系无法计算间接成本"),
        CurrDatetimeComputed("当前日期已经计算过"),
        CheckWeigh("从此节点出发的关系的权重之和不可以大于1"),
        CheckWeigh_NotCompute("从此节点出发的关系的权重不可以计算");


        public String message;

        BaseResponseCodeEnum(String message) {
            this.message = message;
        }
    }

}
