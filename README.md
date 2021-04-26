# DummyConnectivityTest

As the title says, this is a super dummy connectivity tester that aims to just do something more effective than leaving a ping running for hours...

It tests DNS resolution, IP reachability and TCP connectivity to a set of user defined URLs on different stacks: 

 * Shell with curl.
 * Java with an ultra simple depenency free test class.
 * Chrome browser.

The program drops metrics that can be later on plotted using simple Javascript.
