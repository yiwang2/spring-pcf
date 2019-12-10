# Simple Spring Cloud PCF application

- using spring 2
- do not forget disable default security. We will suffer login page if not
- bind service registry in PCF (cf cs p-service-registry standard eureka-service)
- bin config server service in PCF, config server is using yiwang2/spring-pcf as app config sources (cf cs p-config-server standard config-service -c '{"git": { "uri": "https://github.com/yiwang2/spring-pcf", "label": "master" } }')
- coffee consumer uses Fein as LB and also include circle breaker (by fallback)
