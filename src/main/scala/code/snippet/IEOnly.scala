package code.snippet

import net.liftweb.http.S

import scala.xml.{NodeSeq, Unparsed}

object IEOnly {
  def render(ns: NodeSeq): NodeSeq = {
    Unparsed("<!--[if " + condition + "]>") ++ ns ++ Unparsed("<![endif]-->")
  }

  private def condition: String = S.attr("cond") openOr "IE"
}