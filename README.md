# CamelK Serverless (Event Mesh) Demo

## Prerequisites
<ul>
  <li> OCP cluster 4.12
  <li> Install the following operator
  <li> <ul>
         <li> Red Hat Integration - AMQ Broker (7.10.2)
         <li> OpenShift Serverless (1.28)
         <li> Red Hat Integration - Camel K (1.10)
       </ul>
  <li> Create knative eventing in Knative Eventing namespace
  <li> create knative serving in Knative serving namespace
</ul>

## Deployment Instructions
<ul>
  <li> Apply all yaml files in <strong><code>/deploy</code><strong> folder
  <li> Create new table in psql with the following statement <br>
    
```
create table passengers(name varchar, flightno varchar, passportno varchar);
```

  <li> Update Slack webhook url in notification-service kamelet binding (https://api.slack.com/messaging/webhooks)
</ul>


## Demo Data

### JSON File for AMQ Message
```
[{
  "name": "John",
  "nationality": "Malaysian",
  "flightno": "F123",
  "passportno": "P123455"
}, {
  "name": "Jane",
  "nationality": "Singaporean",
  "flightno": "F123",
  "passportno": "P32456"
}]
```
### Curl Command
```
curl "[record submission service route url]/records" \
-X POST \
-H "Content-Type: application/json" \
-d '[{"name":"Bill","nationality":"American","flightno":"F123","passportno":"P123455"},{"name":"Jessica","nationality":"Singaporean","flightno":"F123","passportno":"P32434"}]'
```
