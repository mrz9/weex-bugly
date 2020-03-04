//
//  mrzBuglyAppModule.m
//  Pods
//

#import "mrzBuglyAppModule.h"
#import <WeexPluginLoader/WeexPluginLoader.h>

@interface mrzBuglyAppModule ()

@end

@implementation mrzBuglyAppModule

@synthesize weexInstance;

WX_PlUGIN_EXPORT_MODULE(mrzBugly, mrzBuglyAppModule)

@end
