这个示例用于演示如何使用jersey发布服务。
jersey的配置方式：
1）使用Annotation来配置：创建MyApplication类，继承自ResourceConfig类，可配置rest服务的url根目录以及要扫描的packages；
2）使用web.xml：这种方式只能配置rest服务的url根目录，无法配置packages，应用会进行全目录扫码，效率较低；