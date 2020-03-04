<!--
 * @Author: Dayao
 * @Date: 2020-03-04 11:16:14
 * @LastEditTime: 2020-03-04 11:19:50
 * @Description: 
 -->
# 设备信息

## 安装

```shell script
eeui plugin install https://github.com/mrz9/weex-bugly
```

## 卸载

```shell script
eeui plugin uninstall https://github.com/mrz9/weex-bugly
```

## 参数配置


#### 简单示例

```
{
  ...
  "bugly": {
    "ios": {
      "enabled": true, // 如果设置false表示不开启
      "appKey": "xxxx" // 到bugly平台获取
    },
    "android": {
      "enabled": true,
      "appKey": "xxxx"
    }
	}
  ...
}
```