import typings.langiumDomainmodelDsl.outLanguageServerDomainModelModuleMod.DomainModelModule
import typings.langiumDomainmodelDsl.outLanguageServerDomainModelModuleMod.createDomainModelServices
import typings.langiumDomainmodelDsl.outCliGeneratorMod.generateAction
import typings.langium.nodeMod.NodeFileSystem
import typings.langium.libDefaultModuleMod.DefaultSharedModuleContext

import scalajs.js
@main def hello = 
  

  val services = createDomainModelServices(DefaultSharedModuleContext ((a:js.Any) => NodeFileSystem.fileSystemProvider() ))
  val dmservice = services.domainmodel
  
  println("hello world")