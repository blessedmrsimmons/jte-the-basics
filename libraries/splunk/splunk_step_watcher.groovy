@BeforeStep
void before(context){
   println "Splunk: Running before the ${context.library} library's ${context.step} step"
}

@AfterStep({context.step in config.afterSteps})
void after(context){
   println "Splunk: Running after the ${context.library} library's ${context.step} step"
}
