# federated service mesh demo

## Prerequisites
<ul>
  <li> OCP cluster 4.12
  <li> Install the following operator
  <ul>
     <li> Red Hat Integration - AMQ Broker
     <li> OpenShift Serverless
     <li> Red Hat Integration - Camel K 
  </ul>
</ul>

## Deployment Instructions
<ul>
  <li> Apply all yaml files in /deploy folder
  <li> Create new table in psql with the following statement
         create table passengers(name varchar, flightno varchar, passportno varchar);
  <li> Update Slack webhook url in notification-service kamelet binding (https://api.slack.com/messaging/webhooks)
</ul>


