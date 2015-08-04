package code.snippet

import net.liftweb.http.{S, SHtml}
import net.liftweb.http.js.JsCmds._
import net.liftweb.util.Helpers._

import scala.util.Random
import scala.xml.{NodeSeq, Text}

class PassThruSnippet {

  def render =
    ".container" #> { (in: NodeSeq) => {
      ".button *" #> SHtml.ajaxButton(Text("Check Pass Thru"),
        () => if (fiftyFifty) SetHtml("spn1t", Text("Congratulations! The content was changed"))
        else {
          S.error("checkPrivacyPolicy", <span>See our <a href="/policy">privacy policy</a></span>)
          SetHtml("spn1t", Text("Try again - this is the template content._"))
        }
      )
    }.apply(in)
    }

  private def fiftyFifty = Random.nextBoolean()

  /*  def render =
      if (fiftyFifty) "*" #> Text("Congratulations! The content was changed")
      else PassThru*/
}
