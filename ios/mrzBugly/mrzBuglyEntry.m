//
//  mrzBuglyEntry.m
//  Pods
//

#import "mrzBuglyEntry.h"
#import "mrzBuglyWebModule.h"
#import "WeexInitManager.h"
#import <WebKit/WKWebView.h>
#import <Bugly/Bugly.h>
#import "Config.h"

WEEX_PLUGIN_INIT(mrzBuglyEntry)
@implementation mrzBuglyEntry

//启动成功
- (void) didFinishLaunchingWithOptions:(NSDictionary *)launchOptions
{
    NSMutableDictionary *buglyConfig = [[Config getObject:@"bugly"] objectForKey:@"ios"];

    NSString *appKey = [NSString stringWithFormat:@"%@", buglyConfig[@"appKey"]];
    NSString *nullString = @"(null)";

    if (![appKey isEqualToString:nullString] && appKey.length) {
        [Bugly startWithAppId:appKey];
    }
}

//注册推送成功调用
- (void) didRegisterForRemoteNotificationsWithDeviceToken:(NSData *)deviceToken
{
    
}

// 注册推送失败调用
- (void) didFailToRegisterForRemoteNotificationsWithError:(NSError *)error
{
    
}

//iOS10以下使用这两个方法接收通知
- (void) didReceiveRemoteNotification:(NSDictionary *)userInfo fetchCompletionHandler:(void (^)(UIBackgroundFetchResult))completionHandler
{
    
}

//iOS10新增：处理前台收到通知的代理方法
- (void) willPresentNotification:(UNNotification *)notification withCompletionHandler:(void (^)(UNNotificationPresentationOptions))completionHandler API_AVAILABLE(ios(10.0))
{
    
}

//iOS10新增：处理后台点击通知的代理方法
- (void) didReceiveNotificationResponse:(UNNotificationResponse *)response withCompletionHandler:(void (^)(void))completionHandler API_AVAILABLE(ios(10.0))
{
    
}

//捕捉回调
- (void) openURL:(NSURL *)url options:(NSDictionary<NSString*, id> *)options
{
    
}

//捕捉握手
- (void) handleOpenURL:(NSURL *)url
{

}

//webView初始化
- (void) setJSCallModule:(JSCallCommon *)callCommon webView:(WKWebView*)webView
{
    [callCommon setJSCallAssign:webView name:@"mrzBugly" bridge:[[mrzBuglyWebModule alloc] init]];
}

@end
