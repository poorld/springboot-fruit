# 添加购物车
```
2020-12-15 10:59:18 INFO  HttpClientToolImpl:37 - api请求url :http://127.0.0.1:8080/Shopping/api/v1/cart/count
2020-12-15 10:59:18 INFO  HttpClientToolImpl:44 - 请求报文JSON:{"id":123527,"userName":null,"pwd":null,"nickname":null,"email":null,"enabled":null,"openId":null,"oauthType":null,"image":null,"lastLoginTime":null,"registerTime":null,"lastLoginTimeFrom":null,"lastLoginTimeTo":null,"registerTimeFrom":null,"registerTimeTo":null,"fromAPI":null,"role":null,"confirmPassword":null,"smsCode":null,"amount":0}
2020-12-15 10:59:18	IP:	thread:http-nio-8080-exec-8	USER:	message:select count(*) from order_item where order_num in( select order_num from order_info where user_id = 123527 and type=1 ) 
2020-12-15 10:59:18 INFO  HttpClientToolImpl:57 - 响应报文JSON{"errorCode":"0","errorMsg":"成功","data":0}
2020-12-15 10:59:18 INFO  HttpClientToolImpl:37 - api请求url :http://127.0.0.1:8080/Shopping/api/v1/cart/add
2020-12-15 10:59:18 INFO  HttpClientToolImpl:44 - 请求报文JSON:{"nowPage":1,"orderNum":null,"price":null,"paymentFlag":null,"userId":123527,"contactName":null,"contactMobile":null,"contactAddress":null,"message":null,"status":null,"type":1,"createTime":null,"orderItem":{"id":null,"orderNum":null,"productId":935,"price":null,"userId":123527,"quantity":1,"jsonData":null,"skuId":null,"optionValueKeyGroup":"","productList":null},"endDate":null,"contect":null,"orderHistoryList":null,"contectList":null,"startPrice":null,"endPrice":null,"orderItemList":null,"logisticsList":null,"paymentHistoryList":null,"startDate":null}
2020-12-15 10:59:18	IP:	thread:http-nio-8080-exec-7	USER:	message:select `p`.`id`, `p`.`name`, `p`.`category_id`, `p`.`general_explain`, `p`.`discount`, `p`.`shop_price`, `p`.`price`, `p`.`external_id`, `p`.`quantity`, `p`.`hot`, `p`.`product_status`, `p`.`inventory_flag`, `p`.`default_img`, `p`.`update_time`, `p`.`update_user_id`, `p`.`create_time`, `p`.`create_user_id` from `product` AS `p` WHERE ( `p`.`id` = 935 ) 
2020-12-15 10:59:18	IP:	thread:http-nio-8080-exec-7	USER:	message:select order_num, price, payment_flag, user_id, contact_name, contact_mobile, contact_address, message, status, type, create_time from order_info where user_id = 123527 and type=1 
2020-12-15 10:59:18	IP:	thread:http-nio-8080-exec-7	USER:	message:select type_code, counter_key, no_counter from sequence where type_code = 'O' and counter_key = 'O20201215' 
2020-12-15 10:59:18	IP:	thread:http-nio-8080-exec-7	USER:	message:insert into sequence (type_code, counter_key, no_counter ) values ('O', 'O20201215', 1 ) 
2020-12-15 10:59:18	IP:	thread:http-nio-8080-exec-7	USER:	message:insert into order_info (order_num, price, payment_flag, user_id, contact_name, contact_mobile, contact_address, message, status, type, create_time) values ('O2020121500001', NULL, 0, 123527, NULL, NULL, NULL, NULL, NULL, 1, sysdate()) 
2020-12-15 10:59:18	IP:	thread:http-nio-8080-exec-7	USER:	message:select type_code, counter_key, no_counter from sequence where type_code = 'I' and counter_key = 'I20201215' 
2020-12-15 10:59:18	IP:	thread:http-nio-8080-exec-7	USER:	message:insert into sequence (type_code, counter_key, no_counter ) values ('I', 'I20201215', 1 ) 
2020-12-15 10:59:18	IP:	thread:http-nio-8080-exec-7	USER:	message:select `p`.`id`, `p`.`name`, `p`.`category_id`, `p`.`general_explain`, `p`.`discount`, `p`.`shop_price`, `p`.`price`, `p`.`external_id`, `p`.`quantity`, `p`.`hot`, `p`.`product_status`, `p`.`inventory_flag`, `p`.`default_img`, `p`.`update_time`, `p`.`update_user_id`, `p`.`create_time`, `p`.`create_user_id` from `product` AS `p` WHERE ( `p`.`id` = 935 ) 
2020-12-15 10:59:18	IP:	thread:http-nio-8080-exec-7	USER:	message:insert into order_item (id, order_num, product_id, price, quantity, user_id, option_value_key_group, json_data, sku_id ) values ('I2020121500001', 'O2020121500001', 935, 13000, 1, 123527, '', NULL, NULL ) 
2020-12-15 10:59:18	IP:	thread:http-nio-8080-exec-7	USER:	message:SELECT SUM(t1.price * t1.quantity) FROM order_item t1 WHERE t1.order_num = 'O2020121500001' 
2020-12-15 10:59:18	IP:	thread:http-nio-8080-exec-7	USER:	message:update order_info set price = 13000 where order_num = 'O2020121500001' 
2020-12-15 10:59:18 INFO  HttpClientToolImpl:57 - 响应报文JSON{"errorCode":"0","errorMsg":"成功","data":1}
2020-12-15 10:59:18 INFO  HttpClientToolImpl:37 - api请求url :http://127.0.0.1:8080/Shopping/api/v1/cart/count
2020-12-15 10:59:18 INFO  HttpClientToolImpl:44 - 请求报文JSON:{"id":123527,"userName":null,"pwd":null,"nickname":null,"email":null,"enabled":null,"openId":null,"oauthType":null,"image":null,"lastLoginTime":null,"registerTime":null,"lastLoginTimeFrom":null,"lastLoginTimeTo":null,"registerTimeFrom":null,"registerTimeTo":null,"fromAPI":null,"role":null,"confirmPassword":null,"smsCode":null,"amount":0}
2020-12-15 10:59:18	IP:	thread:http-nio-8080-exec-1	USER:	message:select count(*) from order_item where order_num in( select order_num from order_info where user_id = 123527 and type=1 ) 
2020-12-15 10:59:18 INFO  HttpClientToolImpl:57 - 响应报文JSON{"errorCode":"0","errorMsg":"成功","data":1}
```

## 查询购物车
```sql
select order_num, price, payment_flag, user_id, contact_name, contact_mobile, contact_address, message, status, type, create_time from order_info where user_id = 123527 and type=1 
```
- type=1 类型、购物车