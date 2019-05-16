package org.study.heat.exception;


/**
 * The class Error code enum.
 *
 * @author paascloud.net @gmail.com
 */
public enum ErrorCodeEnum {
	/**
	 * Gl 99990100 error code enum.
	 */
	GL99990100(9999100, "参数异常"),
	/**
	 * Gl 99990401 error code enum.
	 */
	GL99990401(99990401, "无访问权限"),
	/**
	 * Gl 000500 error code enum.
	 */
	GL99990500(500, "未知异常"),
	/**
	 * Gl 000403 error code enum.
	 */
	GL99990403(9999403, "无权访问"),
	/**
	 * Gl 000404 error code enum.
	 */
	GL9999404(9999404, "找不到指定资源"),
	/**
	 * Gl 99990001 error code enum.
	 */
	GL99990001(99990001, "注解使用错误"),
	/**
	 * Gl 99990002 error code enum.
	 */
	GL99990002(99990002, "微服务不在线,或者网络超时"),
	/**
	 * Uac 10010001 error code enum.
	 */
//	 1001 用户中心
	UAC10010001(10010001, "会话超时,请刷新页面重试"),
	/**
	 * Uac 10010002 error code enum.
	 */
	UAC10010002(10010002, "TOKEN解析失败"),
	/**
	 * Uac 10010003 error code enum.
	 */
	UAC10010003(10010003, "操作频率过快, 您的帐号已被冻结"),
	/**
	 * Uac 10011001 error code enum.
	 */
	UAC10011001(10011001, "用户Id不能为空"),
	/**
	 * Uac 10011002 error code enum.
	 */
	UAC10011002(10011002, "找不到用户,loginName=%s"),
	/**
	 * Uac 10011003 error code enum.
	 */
	UAC10011003(10011003, "找不到用户,userId=%s"),
	/**
	 * Uac 10011004 error code enum.
	 */
	UAC10011004(10011004, "找不到用户,email=%s"),
	/**
	 * Uac 10011006 error code enum.
	 */
	UAC10011006(10012006, "手机号不能为空"),
	/**
	 * Uac 10011007 error code enum.
	 */
	UAC10011007(10011007, "登录名不能为空"),
	/**
	 * Uac 10011008 error code enum.
	 */
	UAC10011008(10011008, "新密码不能为空"),
	/**
	 * Uac 10011009 error code enum.
	 */
	UAC10011009(10011009, "确认密码不能为空"),
	/**
	 * Uac 10011010 error code enum.
	 */
	UAC10011010(10011010, "两次密码不一致"),
	/**
	 * Uac 10011011 error code enum.
	 */
	UAC10011011(10011011, "用户不存在, userId=%s"),
	/**
	 * Uac 10011012 error code enum.
	 */
	UAC10011012(10011012, "登录名已存在"),
	/**
	 * Uac 10011013 error code enum.
	 */
	UAC10011013(10011013, "手机号已存在"),
	/**
	 * Uac 10011014 error code enum.
	 */
	UAC10011014(10011014, "密码不能为空"),
	/**
	 * Uac 10011016 error code enum.
	 */
	UAC10011016(10011016, "用户名或密码错误"),
	/**
	 * Uac 10011017 error code enum.
	 */
	UAC10011017(10011017, "验证类型错误"),
	/**
	 * Uac 10011018 error code enum.
	 */
	UAC10011018(10011018, "邮箱不能为空"),
	/**
	 * Uac 10011019 error code enum.
	 */
	UAC10011019(10011019, "邮箱已存在"),
	/**
	 * Uac 10011020 error code enum.
	 */
	UAC10011020(10011020, "短信模板不能为空"),
	/**
	 * Uac 10011021 error code enum.
	 */
	UAC10011021(10011021, "发送短信验证码对象转换为json字符串失败"),
	/**
	 * Uac 10011022 error code enum.
	 */
	UAC10011022(10011022, "发送短信验证码失败"),
	/**
	 * Uac 10011023 error code enum.
	 */
	UAC10011023(10011023, "越权操作"),
	/**
	 * Uac 10011024 error code enum.
	 */
	UAC10011024(10011024, "找不到绑定的用户, userId=%"),
	/**
	 * Uac 10011025 error code enum.
	 */
	UAC10011025(10011025, "登录账号已存在, loginName=%s"),
	/**
	 * Uac 10011026 error code enum.
	 */
	UAC10011026(10011026, "更新用户失败, userId=%s"),
	/**
	 * Uac 10011027 error code enum.
	 */
	UAC10011027(10011027, "找不到用户,mobile=%s"),
	/**
	 * Uac 10011028 error code enum.
	 */
	UAC10011028(10011028, "链接已失效"),
	/**
	 * Uac 10011029 error code enum.
	 */
	UAC10011029(10011029, "重置密码失败"),
	/**
	 * Uac 10011030 error code enum.
	 */
	UAC10011030(10011030, "激活失败, 链接已过期"),
	/**
	 * Uac 10011031 error code enum.
	 */
	UAC10011031(10011031, "验证码超时, 请重新发送验证码"),
	/**
	 * Uac 10011032 error code enum.
	 */
	UAC10011032(10011032, "邮箱不存在, loginName=%s,email=%s"),
	/**
	 * Uac 10011033 error code enum.
	 */
	UAC10011033(10011033, "清空该用户常用菜单失败"),
	/**
	 * Uac 10011034 error code enum.
	 */
	UAC10011034(10011034, "不允许操作admin用户"),
	/**
	 * Uac 10011035 error code enum.
	 */
	UAC10011035(10011035, "原始密码输入错误"),
	/**
	 * Uac 10011036 error code enum.
	 */
	UAC10011036(10011036, "新密码和原始密码不能相同"),
	/**
	 * Uac 10011037 error code enum.
	 */
	UAC10011037(10011037, "修改用户失败,userId=%s"),
	/**
	 * Uac 10011038 error code enum.
	 */
	UAC10011038(10011038, "激活用户失败,userId=%s"),
	/**
	 * Uac 10011039 error code enum.
	 */
	UAC10011039(10011039, "验证token失败"),
	/**
	 * Uac 10011040 error code enum.
	 */
	UAC10011040(10011040, "解析header失败"),
	/**
	 * Uac 10011041 error code enum.
	 */
	UAC10011041(10011041, "页面已过期,请重新登录"),
	/**
	 * Uac 10011042 error code enum.
	 */
	UAC10011042(10011042, "Cookie转码异常"),
	/**
	 * Uac 10011043 error code enum.
	 */
	UAC10011043(10011043, "身份证解析异常, IdCard=%s"),

    /**
     * Uac 10011044 error code enum.
     */
    UAC10011044(10011044, "身份证已经存在"),

    /**
     * Uac 10011045 error code enum.
     */
    UAC10011045(10011045, "登录名已经存在"),

	/**
	 * Uac 10011046 error code enum.
	 */
	UAC10011046(10011046, "身份证错误"),

	/**
	 * Uac 10012001 error code enum.
	 */
	UAC10012001(10012001, "角色ID不能为空"),
	/**
	 * Uac 10012002 error code enum.
	 */
	UAC10012002(10012002, "拥有的角色不允许禁用"),
	/**
	 * Uac 10012003 error code enum.
	 */
	UAC10012003(10012003, "系统角色不能删除"),
	/**
	 * Uac 10012004 error code enum.
	 */
	UAC10012004(10012004, "超级角色Id不能为空"),

	/**
	 * Uac 10012005 error code enum.
	 */
	UAC10012005(10012005, "找不到角色信息,roleId=%s"),
	/**
	 * Uac 10012006 error code enum.
	 */
	UAC10012006(10012006, "删除角色失败, roleId=%s"),
	/**
	 * Uac 10012007 error code enum.
	 */
	UAC10012007(10012007, "批量删除角色失败, roleId=%s"),
	/**
	 * Uac 10012008 error code enum.
	 */
	UAC10012008(10012008, "找不到绑定的角色, roleId=%s"),


	/**
	 * Uac 10013001 error code enum.
	 */
	UAC10013001(10013001, "父菜单不存在,menuId=%s"),
	/**
	 * Uac 10013002 error code enum.
	 */
	UAC10013002(10013002, "更新上级菜单失败,menuId=%s"),
	/**
	 * Uac 10013003 error code enum.
	 */
	UAC10013003(10013003, "菜单不存在,menuId=%s"),
	/**
	 * Uac 10013004 error code enum.
	 */
	UAC10013004(10013004, "启用菜单失败,menuId=%s"),
	/**
	 * Uac 10013005 error code enum.
	 */
	UAC10013005(10013005, "禁用菜单失败,menuId=%s"),
	/**
	 * Uac 10013006 error code enum.
	 */
	UAC10013006(10013006, "更新菜单状态失败,menuId=%s"),
	/**
	 * Uac 10013007 error code enum.
	 */
	UAC10013007(10013007, "根菜单不能禁用"),
	/**
	 * Uac 10013008 error code enum.
	 */
	UAC10013008(10013008, "删除菜单失败, menuId=%s"),
	/**
	 * Uac 10013009 error code enum.
	 */
	UAC10013009(10013009, "请先分配菜单"),
	/**
	 * Uac 10013010 error code enum.
	 */
	UAC10013010(10013010, "选择菜单不是根目录,menuId=%s"),


	/**
	 * Uac 10014001 error code enum.
	 */
	UAC10014001(10014001, "找不到权限信息, actionId=%s"),
	/**
	 * Uac 10014002 error code enum.
	 */
	UAC10014002(10014002, "删除失败, actionId=%s"),
	/**
	 * Uac 10014003 error code enum.
	 */
	UAC10014003(10014003, "保存权限信息失败"),
	/**
	 * Uac 10015001 error code enum.
	 */
	UAC10015001(10015001, "找不到组织信息,groupId=%s"),
	/**
	 * Uac 10015002 error code enum.
	 */
	UAC10015002(10015002, "组织状态不存在"),
	/**
	 * Uac 10015003 error code enum.
	 */
	UAC10015003(10015003, "操作越权, 启用子节点, 必须先启用父节点"),
	/**
	 * Uac 10015004 error code enum.
	 */
	UAC10015004(10015004, "找不到组织信息,groupId=%s"),
	/**
	 * Uac 10015006 error code enum.
	 */
	UAC10015006(10015006, "更新组织信息失败,groupId=%s"),
	/**
	 * Uac 10015007 error code enum.
	 */
	UAC10015007(10015007, "该组织下还存在子节点，不能将其删除, Pid=%s"),
	/**
	 * Uac 10015008 error code enum.
	 */
	UAC10015008(10015008, "该组织下绑定的用户，不能将其删除, groupId=%s"),
	/**
	 * Uac 10015009 error code enum.
	 */
	UAC10015009(10015009, "找不到上级组织, groupId=%s"),

	/**
	 * Uac 10016001 error code dept.
	 */
	UAC10016001(10016001, "父部门不存在, deptId=%s"),
	/**
	 * Uac 10013002 error code enum.
	 */
	UAC10016002(10016002, "更新上级部门失败, deptId=%s"),
	/**
	 * Uac 10013003 error code enum.
	 */
	UAC10016003(10016003, "部门不存在, deptId=%s"),
	/**
	 * Uac 10013004 error code enum.
	 */
	UAC10016004(10016004, "启用部门失败, deptId=%s"),
	/**
	 * Uac 10013005 error code enum.
	 */
	UAC10016005(10016005, "禁用部门失败, deptId=%s"),
	/**
	 * Uac 10013006 error code enum.
	 */
	UAC10016006(10016006, "更新部门状态失败, deptId=%s"),
	/**
	 * Uac 10013007 error code enum.
	 */
	UAC10016007(10016007, "根部门不能禁用"),
	/**
	 * Uac 10013008 error code enum.
	 */
	UAC10016008(10016008, "删除部门失败, deptId=%s"),
	/**
	 * Uac 10013009 error code enum.
	 */
	UAC10016009(10016009, "请先分配部门"),
	/**
	 * Uac 10013010 error code enum.
	 */
	UAC10016010(10016010, "选择部门不是根目录, deptId=%s"),
	/**
	 * Uac 10013010 error code enum.
	 */
	UAC10016011(10016011, "根部门不能删除, deptId=%s"),

	/**
	 * Uac 10017001 error code emp.
	 */
	UAC10017001(10017001, "员工添加失败"),
	/**
	 * Uac 10017002 error code emp.
	 */
	UAC10017002(10017002, "员工修改失败, userId=%s"),
	/**
	 * Uac 10017003 error code emp.
	 */
	UAC10017003(10017003, "员工不存在, userId=%s"),
	/**
	 * Uac 10017004 error code emp.
	 */
	UAC10017004(10017004, "删除员工失败, userId=%s"),

	/**
	 * Uac 10017005 error code emp.
	 */
	UAC10017005(10017005, "该员工为管理员, userId=%s"),

	/**
	 * Mdc 10021001 error code enum.
	 */
	// 1002 数据中心
	MDC10021001(10021001, "获取地址信息失败"),
	/**
	 * Mdc 10021002 error code enum.
	 */
	MDC10021002(10021002, "找不到该地址信息"),
	/**
	 * Mdc 10021003 error code enum.
	 */
	MDC10021003(10021003, "获取商品信息失败"),
	/**
	 * Mdc 10021004 error code enum.
	 */
	MDC10021004(10021004, "找不到该商品信息,productId=%s"),
	/**
	 * Mdc 10021015 error code enum.
	 */
	MDC10021015(10021015, "商品不是在线售卖状态, productId=%s"),
	/**
	 * Mdc 10021016 error code enum.
	 */
	MDC10021016(10021016, "商品库存不足, productId=%s"),
	/**
	 * Mdc 10021017 error code enum.
	 */
	MDC10021017(10021017, "产品已下架或者删除, productId=%s"),
	/**
	 * Mdc 10021018 error code enum.
	 */
	MDC10021018(10021018, "找不到数据字典信息, dictId=%s"),
	/**
	 * Mdc 10021019 error code enum.
	 */
	MDC10021019(10021019, "更新字典状态失败, dictId=%s"),
	/**
	 * Mdc 10021020 error code enum.
	 */
	MDC10021020(10021020, "上级数据字典不存在, dictId=%s"),
	/**
	 * Mdc 10021021 error code enum.
	 */
	MDC10021021(10021021, "商品ID不能为空"),
	/**
	 * Mdc 10021024 error code enum.
	 */
	MDC10021024(10021024, "商品编码不能为空"),

	/**
	 * Mdc 10023001 error code enum.
	 */
	MDC10023001(10023001, "找不到商品分类信息, categoryId=%s"),

	/**
	 * Mdc 10023002 error code enum.
	 */
	MDC10023002(10023002, "上级商品分类不存在, categoryId=%s"),

	/**
	 * Mdc 10023003 error code enum.
	 */
	MDC10023003(10023003, "更新商品分类状态失败, categoryId=%s"),
	/**
	 * Mdc 10021022 error code enum.
	 */
	MDC10021022(10021022, "更新商品信息失败, productId=%s"),
	/**
	 * Mdc 10021023 error code enum.
	 */
	MDC10021023(10021023, "删除商品信息失败, productId=%s"),
	/**
	 * Omc 10031001 error code enum.
	 */
// 1003 订单中心
	OMC10031001(10031001, "购物车为空, userId=%s"),
	/**
	 * Omc 10031002 error code enum.
	 */
	OMC10031002(10031002, "生成订单失败"),
	/**
	 * Omc 10031003 error code enum.
	 */
	OMC10031003(10031003, "该用户此订单不存在"),
	/**
	 * Omc 10031004 error code enum.
	 */
	OMC10031004(10031004, "已付款, 无法取消订单"),
	/**
	 * Omc 10031005 error code enum.
	 */
	OMC10031005(10031005, "找不到订单信息, orderNo=%s"),
	/**
	 * Omc 10031006 error code enum.
	 */
	OMC10031006(10031006, "清空购物车失败"),
	/**
	 * Omc 10031007 error code enum.
	 */
	OMC10031007(10031007, "不存在默认地址"),
	/**
	 * Omc 10031008 error code enum.
	 */
	OMC10031008(10031008, "更新默认地址失败, addressId=%s"),
	/**
	 * Omc 10031009 error code enum.
	 */
	OMC10031009(10031009, "批量插入订单明细失败"),
	/**
	 * Omc 10031010 error code enum.
	 */
	OMC10031010(10031010, "非快乐学习网的订单, 回调忽略"),
	/**
	 * Omc 10031011 error code enum.
	 */
	OMC10031011(10031011, "支付宝重复调用"),
	/**
	 * Omc 10031012 error code enum.
	 */
	OMC10031012(10031012, "上传失败"),
	/**
	 * Omc 10031013 error code enum.
	 */
	OMC10031013(10031013, "获取附件地址失败"),
	/**
	 * Omc 10031014 error code enum.
	 */
	OMC10031014(10031014, "更新购物车数据失败, cartId=%s"),
	/**
	 * Omc 10031016 error code enum.
	 */
	OMC10031016(10031016, "更新购物车数据失败, cartId=%s"),

	/**
	 * Omc 10031017 error code enum.
	 */
	OMC10031017(10031017, "老人不存在, oldmanId=%s"),
	/**
	 * Opc 10040001 error code enum.
	 */
// 1004 对接中心
	OPC10040001(10040001, "根据IP定位失败"),
	/**
	 * Opc 10040002 error code enum.
	 */
	OPC10040002(10040002, "上传文件失败"),
	/**
	 * Opc 10040003 error code enum.
	 */
	OPC10040003(10040003, "文件类型不符"),
	/**
	 * Opc 10040004 error code enum.
	 */
	OPC10040004(10040004, "发送短信失败"),
	/**
	 * Opc 10040005 error code enum.
	 */
	OPC10040005(10040005, "生成邮件消息体失败"),
	/**
	 * Opc 10040006 error code enum.
	 */
	OPC10040006(10040006, "获取模板信息失败"),
	/**
	 * Opc 10040007 error code enum.
	 */
	OPC10040007(10040007, "更新附件失败, id=%s"),
	/**
	 * Opc 10040008 error code enum.
	 */
	OPC10040008(10040008, "找不到该附件信息, id=%s"),
	/**
	 * Opc 10040009 error code enum.
	 */
	OPC10040009(10040009, "上传图片失败"),
	/**
	 * Tpc 10050001 error code enum.
	 */
	OPC10040010(10040010, "文件名不能为空"),
	/**
	 * Opc 10040011 error code enum.
	 */
	OPC10040011(10040011, "今日流量已用尽, 请明天再试"),
	/**
	 * Tpc 10050001 error code enum.
	 */
// 1005 任务中心
	TPC10050001(10050001, "消息的消费Topic不能为空"),
	/**
	 * Tpc 10050002 error code enum.
	 */
	TPC10050002(10050002, "根据消息key查找的消息为空"),
	/**
	 * Tpc 10050003 error code enum.
	 */
	TPC10050003(10050003, "删除消息失败,messageKey=%s"),
	/**
	 * Tpc 10050004 error code enum.
	 */
	TPC10050004(10050004, "消息中心接口异常,message=%s, messageKey=%s"),
	/**
	 * Tpc 10050005 error code enum.
	 */
	TPC10050005(10050005, "目标接口参数不能为空"),
	/**
	 * Tpc 10050006 error code enum.
	 */
	TPC10050006(10050006, "根据任务Id查找的消息为空"),

	/**
	 * Tpc 10050007 error code enum.
	 */
	TPC10050007(10050007, "消息数据不能为空"),
	/**
	 * Tpc 10050008 error code enum.
	 */
	TPC10050008(10050008, "消息体不能为空,messageKey=%s"),
	/**
	 * Tpc 10050009 error code enum.
	 */
	TPC10050009(10050009, "消息KEY不能为空"),
	/**
	 * Tpc 100500010 error code enum.
	 */
	TPC100500010(10050010, "Topic=%s, 无消费者订阅"),
	/**
	 * Tpc 100500011 error code enum.
	 */
	TPC100500011(10050011, "Mq编码转换异常, MessageKey=%s"),
	/**
	 * Tpc 100500012 error code enum.
	 */
	TPC100500012(10050012, "发送MQ失败, MessageKey=%s"),
	/**
	 * Tpc 100500013 error code enum.
	 */
	TPC100500013(10050013, "延迟级别错误, Topic=%s, MessageKey=%s"),
	/**
	 * Tpc 100500014 error code enum.
	 */
	TPC100500014(10050014, "MQ重试三次,仍然发送失败, Topic=%s, MessageKey=%s"),
	/**
	 * Tpc 100500015 error code enum.
	 */
	TPC100500015(10050015, "消息PID不能为空, messageKey=%s"),


	// 1006 设备中心
	/**
	 * Dmc 10060001 error code enum
	 */
	DMC100610001(10061001, "设备编号已经存在"),

	/**
	 * Dmc 10060002 error code enum
	 */
	DMC100610002(10061002, "设备不存在, deviceId=%s"),

	/**
	 * Dmc 10060003 error code enum
	 */
	DMC100610003(10061003, "设备已存在指定的防区编号, deviceId=%s, zoneNo=%s"),

	/**
	 * Dmc 10060004 error code enum
	 */
	DMC100610004(10061004, "电话机防区不存在, zoneId=%s"),

	/**
	 * Dmc 10060005 error code enum
	 */
	DMC100610005(10061005, "红键电话号码错误"),

	/**
	 * Dmc 10060006 error code enum
	 */
	DMC100610006(10061006, "黄键电话号码错误"),

	/**
	 * Dmc 10060007 error code enum
	 */
	DMC100610007(10061007, "绿键电话号码错误"),

	/**
	 * Dmc 10060008 error code enum
	 */
	DMC100610008(10061008, "门禁读卡器已经绑定, deviceId=%s, location=%s"),

	/**
	 * Dmc 10060009 error code enum
	 */
	DMC100610009(10061009, "门禁读卡器尚未绑定, deviceId=%s"),

	/**
	 * Dmc 10060010 error code enum
	 */
	DMC100610010(10061010, "孝心手环尚未初始化配置, deviceId=%s"),

    /**
     * Dmc 10060011 error code enum
     */
    DMC100610011(10061011, "门禁卡已经绑定过, deviceId=%s, oldmanId=%s, oldmanName=%s"),

	/**
	 * Dmc 10060012 error code enum
	 */
	DMC100610012(10061012, "孝心手环已经绑定过, deviceId=%s, oldmanId=%s, oldmanName=%s"),

	/**
	 * Dmc 10060013 error code enum
	 */
	DMC100610013(10061013, "该设备不是孝心手环, deviceId=%s, deviceType=%s, deviceTypeCode=%s"),

	/**
	 * Dmc 10060014 error code enum
	 */
	DMC100610014(10061014, "该设备不存在或不是孝心手环, deviceId=%s"),

	/**
	 * Dmc 10060015 error code enum
	 */
	DMC100610015(10061015, "该设备不是门禁读卡器, deviceId=%s, deviceType=%s, deviceTypeCode=%s"),

	/**
	 * Dmc 10060016 error code enum
	 */
	DMC100610016(10061016, "该设备不存在或不是门禁读卡器, deviceId=%s"),

	/**
	 * Dmc 10060017 error code enum
	 */
	DMC100610017(10061017, "该设备不是门禁卡标签, deviceId=%s, deviceType=%s, deviceTypeCode=%"),

	/**
	 * Dmc 10060018 error code enum
	 */
	DMC100610018(10061018, "该设备不存在或不是门禁卡标签, deviceId=%s"),

	/**
	 * Dmc 10060019 error code enum
	 */
	DMC100610019(10061019, "该闹钟不存在, id=%s"),

	/**
	 * Dmc 10060020 error code enum
	 */
	DMC100610020(10061020, "该闹钟不存在铃声文件, id=%s"),

	/**
	 * Dmc 10060021 error code enum
	 */
	DMC100610021(10061021, "该设备不是智能电话机, deviceId=%s, deviceType=%s, deviceTypeCode=%s"),

	/**
	 * Dmc 10061022 error code enum
	 */
	DMC100610022(10061022, "智能电话机已经绑定, deviceId=%s, location=%s"),

	/**
	 * Dmc 10060023 error code enum
	 */
	DMC100610023(10061023, "该设备不存在或不是智能电话机, deviceId=%s"),

	/**
	 * Dmc 10060024 error code enum
	 */
	DMC100610024(10061024, "智能电话机尚未绑定, deviceId=%s"),

	/**
	 * Dmc 10060025 error code enum
	 */
	DMC100610025(10061025, "该设备不是人体感应, deviceId=%s, deviceType=%s, deviceTypeCode=%s"),

	/**
	 * Dmc 10060026 error code enum
	 */
	DMC100610026(10061026, "该设备不是紧急按钮, deviceId=%s, deviceType=%s, deviceTypeCode=%s"),

	/**
	 * Dmc 10060027 error code enum
	 */
	DMC100610027(10061027, "该设备不存在或不是人体感应, deviceId=%s"),

	/**
	 * Dmc 10061028 error code enum
	 */
	DMC100610028(10061028, "人体感应已经绑定, deviceId=%s, location=%s"),

	/**
	 * Dmc 10060029 error code enum
	 */
	DMC100610029(10061029, "人体感应尚未绑定, deviceId=%s"),

	/**
	 * Dmc 10060030 error code enum
	 */
	DMC100610030(10061030, "该设备不存在或不是紧急按钮, deviceId=%s"),

	/**
	 * Dmc 10061031 error code enum
	 */
	DMC100610031(10061031, "紧急按钮已经绑定, deviceId=%s, location=%s"),

	/**
	 * Dmc 10060032 error code enum
	 */
	DMC100610032(10061032, "紧急按钮尚未绑定, deviceId=%s"),

	/**
	 * Dmc 10060033 error code enum
	 */
	DMC100610033(10061033, "该设备不是智能床垫 - 日创, deviceId=%s, deviceType=%s, deviceTypeCode=%s"),

	/**
	 * Dmc 10060034 error code enum
	 */
	DMC100610034(10061034, "该设备不存在或不是智能床垫 - 日创, deviceId=%s"),

	/**
	 * Dmc 10061035 error code enum
	 */
	DMC100610035(10061035, "智能床垫 - 日创已经绑定, deviceId=%s, location=%s"),

	/**
	 * Dmc 10060036 error code enum
	 */
	DMC100610036(10061036, "智能床垫 - 日创尚未绑定, deviceId=%s"),

	/**
	 * Dmc 10060037 error code enum
	 */
	DMC100610037(10061037, "该设备不存在或不是智能床垫 - 睡眠卫士, deviceId=%s"),

	/**
	 * Dmc 10061038 error code enum
	 */
	DMC100610038(10061038, "智能床垫 - 睡眠卫士已经绑定, deviceId=%s, location=%s"),

	/**
	 * Dmc 10060039 error code enum
	 */
	DMC100610039(10061039, "智能床垫 - 睡眠卫士尚未绑定, deviceId=%s"),

	/**
	 * Dmc 10060040 error code enum
	 */
	DMC100610040(10061040, "该设备不是智能床垫 - 睡眠卫士, deviceId=%s, deviceType=%s, deviceTypeCode=%s"),

	/**
	 * Dmc 10060041 error code enum
	 */
	DMC100610041(10061041, "该设备不存在或不是随访仪, deviceId=%s"),

	/**
	 * Dmc 10060042 error code enum
	 */
	DMC100610042(10061042, "该设备不是随访仪, deviceId=%s, deviceType=%s, deviceTypeCode=%s"),

	/**
	 * Dmc 10060043 error code enum
	 */
	DMC100610043(10061043, "报警信息不存在"),

	/**
	 * Dmc 10060044 error code enum
	 */
	DMC100610044(10061044, "孝心手环尚未绑定"),

	/**
	 * Dmc 10060044 error code enum
	 */
	DMC100610045(10061045, "查询老人手环位置数据失败"),

	/**
	 * Dmc 10060046 error code enum
	 */
	DMC100610046(10061046, "查询绑定孝心手环老人列表失败"),

	/**
	 * Dmc 10060047 error code enum
	 */
	DMC100610047(10061047, "安全区域名称已经存在"),

	/**
	 * Dmc 10060048 error code enum
	 */
	DMC100610048(10061048, "安全区域不存在"),

	/**
	 * Dmc 10060049 error code enum
	 */
	DMC100610049(10061049, "电话号码在白名单中已经在"),

	/**
	 * Dmc 10060050 error code enum
	 */
	DMC100610050(10061050, "查询人体感应失败"),

	/**
	 * Dmc 10060051 error code enum
	 */
	DMC100610051(10061051, "查询智能床垫数据失败"),

	/**
	 * Dmc 10060052 error code enum
	 */
	DMC100610052(10061052, "查询紧急按钮失败"),

	/**
	 * Dmc 10060053 error code enum
	 */
	DMC100610053(10061053, "查询门禁卡标签失败"),

	/**
	 * Dmc 10060054 error code enum
	 */
	DMC100610054(10061054, "查询设备报警信息失败"),

	/**
	 * Dmc 10060055 error code enum
	 */
	DMC100610055(10061055, "推送阈值保存消息失败"),

	/**
	 * Dmc 10060056 error code enum
	 */
	DMC100610056(10061056, "推送楼栋楼层更新消息失败"),

	/**
	 * Dmc 10060057 error code enum
	 */
	DMC100610057(10061057, "暂未查询到床垫数据"),

	/**
	 * Dmc 10061058 error code enum
	 */
	DMC100610058(10061058, "房间Id暂未查到"),

	/**
	 * Dmc 10061059 error code enum
	 */
	DMC100610059(10061059, "房间Id查到失败"),

	/**
	 * Dmc 10061060 error code enum
	 */
	DMC100610060(10061060, "床位Id暂未查到"),

	/**
	 * Dmc 10061061 error code enum
	 */
	DMC100610061(10061061, "床位Id查到失败"),

	/**
	 * Dmc 10061062 error code enum
	 */
	DMC100610062(10061062, "老人Id暂未查到"),

	/**
	 * Dmc 10061063 error code enum
	 */
	DMC100610063(10061063, "老人Id查到失败"),;

	private int code;
	private String msg;

	/**
	 * Msg string.
	 *
	 * @return the string
	 */
	public String msg() {
		return msg;
	}

	/**
	 * Code int.
	 *
	 * @return the int
	 */
	public int code() {
		return code;
	}

	ErrorCodeEnum(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	/**
	 * Gets enum.
	 *
	 * @param code the code
	 *
	 * @return the enum
	 */
	public static ErrorCodeEnum getEnum(int code) {
		for (ErrorCodeEnum ele : ErrorCodeEnum.values()) {
			if (ele.code() == code) {
				return ele;
			}
		}
		return null;
	}
}
