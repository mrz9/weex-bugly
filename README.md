
## 说明
本插件只对bugly做了初始化处理，andorid会识别构建环境是否为debug来开启bugly的debug

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
      "appKey": "xxxx" // 到bugly平台获取
    },
    "android": {
      "appKey": "xxxx"
    }
	}
  ...
}
```