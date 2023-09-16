# SjsStDomainModelExample
 
In order to link with Langium's DomainModel Example


npm link //on the DomainModel Example

goto this project's examples/usingdomainexample

npm link langium-domainmodel-dsl --save
<!-- I am not sure if you need the --save at the end -->
<!-- this refers to the 'name' field of the package.json within the domainmodel example -->

Run
sbt

ScalablyTyped will create the Scala facades within sbt once you try to compile

The compile time takes a while.

You need the a larger heap size for the jvm than the default.  This is configured in: .jvmopts

