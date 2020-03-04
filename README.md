
## 说明
本插件只对bugly做了初始化处理

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