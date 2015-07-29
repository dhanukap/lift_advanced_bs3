import net.liftweb.util.Helpers._

val f = "a [href]" #> "http://example.org"
val in = <a>Click me</a>
f(in)

def render1 = "#foo" #> <div id="bar"/> andThen "#bar *" #> "bar content"
val t1 = render1
t1(<div id="foo" />)

def render2 = "#foo" #> <div id="bar"/> & "#bar *" #> "bar content"
render2(<div id="foo" />)

val f2 = "@keywords [content]" #> "words, we really, want"
val in2 = <meta name="keywords" content="words, here, please" />
val t2 = f2(in2)
val remove = "@keywords [content!]" #> "words, here, please"
val t3 = remove(in2)
val add = "@keywords [content+]" #> ", thank you"
val t4 = add(in2)

def render3 = "div [class+]" #> "btn-primary"
val t5 = render3(<div class="btn" />)

def render4 = "title *" #> "I am different"
val t6 = render4(<title></title>)

val in3 = <title data-lift="Mytitle"></title>

object MyTitle {
  def render = <title><lift:Menu.title /> - Site Title</title>
}

