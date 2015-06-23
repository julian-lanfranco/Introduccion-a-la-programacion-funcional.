package utils

object ProbarFraccion {
  new Fraccion(1,3)                               //> scala.NotImplementedError: an implementation is missing
                                                  //| 	at scala.Predef$.$qmark$qmark$qmark(Predef.scala:225)
                                                  //| 	at utils.Fraccion.toString(Fraccion.scala:53)
                                                  //| 	at scala.runtime.ScalaRunTime$.scala$runtime$ScalaRunTime$$inner$1(Scala
                                                  //| RunTime.scala:332)
                                                  //| 	at scala.runtime.ScalaRunTime$.stringOf(ScalaRunTime.scala:337)
                                                  //| 	at scala.runtime.ScalaRunTime$.stringOf(ScalaRunTime.scala:262)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$show(Worksh
                                                  //| eetSupport.scala:90)
                                                  //| 	at utils.ProbarFraccion$$anonfun$main$1.apply$mcV$sp(utils.ProbarFraccio
                                                  //| n.scala:4)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at utils.ProbarFraccion$.main(utils.ProbarFraccion.scala:3)
                                                  //| 	a
                                                  //| Output exceeds cutoff limit.
}