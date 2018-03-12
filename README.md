# Echo
Echo service used for simple http testing.

# How to use
- Update application.properties with port you want to use
- Build application:
```
./gradlew clean
```
```
./gradlew assemble
```
- Start Spring application
- Target echo call for GET:
```
/echo/{message}
```
or
```
/echo
```
for POST, PUT amd DELETE. Payload:
```json
{
  "message": "message content ..."
}
```
