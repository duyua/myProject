package com.song.Controller;

import com.song.Entity.OrderDetails;
import com.song.Service.OrderDetailService;
import com.song.Service.PointsDetailService;
import com.song.Service.PointsOutService;
import com.song.Utils.JsonResult;
import com.song.Utils.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/order")
public class OrderDetailsController {
    @Autowired
    private OrderDetailService orderDetailService;
    @Autowired
    private PointsDetailService pointsDetailService;

    private static final String NONE_ORDER = "没有:";

    /**
     * 订单生成--新增
     *
     * @param details
     * @return
     */
    @RequestMapping("addorder")
    @ResponseBody
    public JsonResult toAddOrder(@RequestBody OrderDetails details) {
        if (details == null)
            return new JsonResult(ResultCode.NONE_ARGRMENT.val(), ResultCode.NONE_ARGRMENT.msg(), null);
        OrderDetails details1 = orderDetailService.toSave(details);
        if (details1 == null)
            return new JsonResult(ResultCode.FAIL.val(), ResultCode.FAIL.msg(), null);
        return new JsonResult(ResultCode.SUCCESS.val(), ResultCode.SUCCESS.msg(), null);
    }

    /**
     * 取消订单
     * 订单号不一致问题?
     */
    @RequestMapping("cancle")
    @ResponseBody
    public JsonResult cancleOrder(@RequestParam String orderNo) {
        if (StringUtils.isEmpty(orderNo))//请求参数为空
            return new JsonResult(ResultCode.NONE_ARGRMENT.val(), ResultCode.NONE_ARGRMENT.msg(), null);
        try {
            OrderDetails serviceOne = orderDetailService.findByOrderNo(orderNo);
            if (serviceOne == null)
                return new JsonResult(ResultCode.FAIL.val(), NONE_ORDER + orderNo, null);
            serviceOne.setStatus("2");//已取消
            orderDetailService.toSave(serviceOne);
            //新增积分
            pointsDetailService.toAddIntegral(serviceOne.getIntegralCount(), serviceOne.getUserPhone());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            new JsonResult(ResultCode.EXCEPTION.val(), ResultCode.EXCEPTION.msg(), null);
        }
        return new JsonResult(ResultCode.SUCCESS.val(), ResultCode.SUCCESS.msg(), null);

    }

    /**
     * 通过订单号查询订单信息
     */
    @RequestMapping("findbyorderno")
    @ResponseBody
    public JsonResult findbyorderno(@RequestParam String orderNo) {
        if (StringUtils.isEmpty(orderNo))//请求参数为空
            return new JsonResult(ResultCode.NONE_ARGRMENT.val(), ResultCode.NONE_ARGRMENT.msg(), null);
        OrderDetails orderDetails = null;
        try {
            orderDetails = orderDetailService.findByOrderNo(orderNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new JsonResult(ResultCode.SUCCESS.val(), ResultCode.SUCCESS.msg(), orderDetails);
    }
}
