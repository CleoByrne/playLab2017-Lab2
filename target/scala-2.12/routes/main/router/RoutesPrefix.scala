
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/playapps/helloworld/conf/routes
// @DATE:Mon Oct 23 12:28:50 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
