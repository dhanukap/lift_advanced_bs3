package code.snippet

import net.liftweb.http.S

import scala.xml.{Unparsed, NodeSeq}

object IEOnly {
  private def condition : String =  S.attr("cond") openOr "IE"

  def render(ns: NodeSeq) : NodeSeq = {
    Unparsed("<!--[if " + condition + "]>") ++ ns ++ Unparsed("<![endif]-->")
  }
}