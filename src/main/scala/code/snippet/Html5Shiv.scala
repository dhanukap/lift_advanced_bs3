package code.snippet

import scala.xml.Unparsed

object Html5Shiv {
  def render = Unparsed(
    """<!--[if lt IE 15]>
      |<script src="http://html5shim.googlecode.com/svn/trunk/html5.js">
      |</script><![endif]-->""".stripMargin)
}
