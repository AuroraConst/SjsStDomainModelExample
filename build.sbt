import org.scalajs.jsenv.nodejs.NodeJSEnv.{Config,SourceMap}

lazy val commonSettings = Seq(
    scalaVersion := "3.3.1",

    libraryDependencies ++= Seq(
    "com.lihaoyi" %%% "upickle" % "3.1.2",
    "org.scalatest" %%% "scalatest"      % "3.2.16"    % "test"
    ),

    //Node.js is the default environment used by Scala.js. You can also explicitly enable it, for example to customize it, using the following sbt setting:
    //experimental specifier allows to resolve imports without .js extension specified
    jsEnv := new org.scalajs.jsenv.nodejs.NodeJSEnv(Config().withArgs(List("--experimental-specifier-resolution=node"))),

    // ECMAScript
    scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.ESModule) },    
    // CommonJS
    // scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) },    
    stIgnore ++= List("lodash"),
    // Tell ScalablyTyped that we manage `npm install` ourselves
    externalNpm := baseDirectory.value

)



lazy val usingdomainexample = project.in(file("examples/usingdomainexample"))
  .enablePlugins(ScalaJSPlugin,ScalablyTypedConverterExternalNpmPlugin)
  .settings(
    commonSettings,
    // for an application with a main method
    scalaJSUseMainModuleInitializer := true
  )