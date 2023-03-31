// camel-k: language=groovy

// Write your routes here, for example:
from("rest:post:records")
  .to("knative:channel/record-received")
  .transform().constant("Record has been submitted");
