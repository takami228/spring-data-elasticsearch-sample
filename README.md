# spring-data-elasticsearch-sample

I try to build sample app following url.
https://www.mkyong.com/spring-boot/spring-boot-spring-data-elasticsearch-example/

But I can't solve the JNA Class Not found Error.

```
2018-03-09 16:11:13.994  WARN 18767 --- [           main] org.elasticsearch.bootstrap              : JNA not found. native methods will be disabled.

java.lang.ClassNotFoundException: com.sun.jna.Native
	at java.net.URLClassLoader.findClass(URLClassLoader.java:381) ~[na:1.8.0_161]
	at java.lang.ClassLoader.loadClass(ClassLoader.java:424) ~[na:1.8.0_161]
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:338) ~[na:1.8.0_161]
	at java.lang.ClassLoader.loadClass(ClassLoader.java:357) ~[na:1.8.0_161]
	at java.lang.Class.forName0(Native Method) ~[na:1.8.0_161]
	at java.lang.Class.forName(Class.java:264) ~[na:1.8.0_161]
	at org.elasticsearch.bootstrap.Natives.<clinit>(Natives.java:45) ~[elasticsearch-2.4.6.jar:2.4.6]
...

```

