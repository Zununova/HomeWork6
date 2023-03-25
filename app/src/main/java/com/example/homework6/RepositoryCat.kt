package com.example.homework6

class RepositoryCat {
    private val catList = mutableListOf<CatItems>()
    private val text : String = "https://http.cat/"

    fun getCatList() : MutableList<CatItems> {
        catList.add(CatItems(
            "https://http.cat/100",
            "Continue",
            "The continue statement" +
                    " interrupts the execution" +
                    " of the current iteration" +
                    " of the current or marked" +
                    " loop, and continues its" +
                    " execution at the next" +
                    " iteration."))
        catList.add(CatItems(
            "${text}101",
            "Switching Protocols",
            "Ошибка программной" +
                    " логики возникает," +
                    " когда, несмотря на" +
                    " точный ввод от" +
                    " пользователя," +
                    " производится неверный" +
                    " вывод."))
        catList.add(CatItems(
            "${text}102",
            "Processing",
            "логическая ошибка возникает," +
                    " когда компьютер генерирует" +
                    " неправильный вывод," +
                    " даже если пользователь" +
                    " предоставляет правильный ввод."))
        catList.add(CatItems(
            "${text}103",
            "Early Hints",
            " A \"logic error\" is said" +
                    " to be generated when" +
                    " software receives the correct" +
                    " input but generates incorrect" +
                    " output. "))
        catList.add(CatItems(
            "${text}200",
            "OK",
            "The 200 OK status code" +
                    " means that the request" +
                    " was successful," +
                    " but the meaning of success" +
                    " depends on the request method"))
        catList.add(CatItems(
            "${text}201",
            "Created",
            "201 status code:" +
                    " The request has succeeded" +
                    " and a new resource has been" +
                    " created as a result."))
        catList.add(CatItems(
            "${text}202",
            "Accepted",
            "The 202 Accepted status" +
                    " code means that the server" +
                    " has received a request for" +
                    " processing, and it is been " +
                    "accepted, but the request " +
                    "has not been completed."))
        catList.add(CatItems(
            "${text}203",
            "Non-Authoritative Information",
            "Usually, error 203" +
                    " can occur if there missing" +
                    " or compromised registry keys," +
                    " two incompatible software " +
                    "running, memory issues or the " +
                    "system might be infected with " +
                    "a virus."))
        catList.add(CatItems(
            "${text}204",
            "No Content",
            "The HTTP 204 No" +
                    " Content success status" +
                    " response code indicates " +
                    "that a request has succeeded, " +
                    "but that the client doesn't" +
                    " need to navigate away from its" +
                    " current page."))
        catList.add(CatItems(
            "${text}206",
            "Partial Content",
            "The HTTP 206 Partial" +
                    " Content success status" +
                    " response code indicates" +
                    " that the request has succeeded " +
                    "and the body contains the " +
                    "requested ranges of data," +
                    " as described in the Range" +
                    " header of the request."))
        catList.add(CatItems(
            "${text}207",
            "Multi-Status",
            "Error 207 Logic Error" +
                    " - A \"logic error\" is said " +
                    "to be generated when " +
                    "software receives the correct" +
                    " input but generates incorrect" +
                    " output. This is seen " +
                    "when Google Inc.'s source " +
                    "code involves a defect in the input data analysis."))
        catList.add(CatItems(
            "${text}300",
            "Multiple Choices",
            ""))
        catList.add(CatItems(
            "${text}301",
            "Moved Permanently",
            ""))
        catList.add(CatItems(
            "${text}302",
            "Found",
            "These codes " +
                    "indicate that " +
                    "additional action is " +
                    "needed to complete the request, " +
                    "usually a redirection."))
        catList.add(CatItems(
            "${text}303",
            "See Other",
            ""))
        catList.add(CatItems(
            "${text}304",
            "Not Modified",
            ""))
        catList.add(CatItems(
            "${text}305",
            "Use Proxy",
            ""))
        catList.add(CatItems(
            "${text}307",
            "Temporary Redirect",
            ""))
        catList.add(CatItems(
            "${text}308",
            "Permanent Redirect",
            ""))
        catList.add(CatItems(
            "${text}400",
            "Bad Request",
            ""))
        catList.add(CatItems(
            "${text}401",
            "Unauthorized",
            ""))
        catList.add(CatItems(
            "${text}402",
            "Payment Required",
            ""))
        catList.add(CatItems(
            "${text}403",
            "Forbidden",
            ""))
        catList.add(CatItems(
            "${text}404",
            "Not Found",
            ""))
        catList.add(CatItems(
            "${text}405",
            "MethodNot Allowed",
            ""))
        catList.add(CatItems(
            "${text}406",
            "Not Acceptable",
            ""))
        catList.add(CatItems(
            "${text}407",
            "Proxy ",
            ""))
        catList.add(CatItems(
            "${text}408",
            "request Timeout",
            ""))
        catList.add(CatItems(
            "${text}409",
            "Conflict",
            ""))
        catList.add(CatItems(
            "${text}410",
            "Gone",
            ""))
        catList.add(CatItems(
            "${text}411",
            "Length Required",
            ""))
        catList.add(CatItems(
            "${text}412",
            "Precondition Failed",
            ""))
        catList.add(CatItems(
            "${text}413",
            "Payload Too Large",
            ""))
        catList.add(CatItems(
            "${text}414",
            "Request-URI Too Long",
            ""))
        catList.add(CatItems(
            "${text}415",
            "Unsupported Media Type",
            ""))
        catList.add(CatItems(
            "${text}416",
            "Request Range Not Satisfiable",
            ""))
        catList.add(CatItems(
            "${text}417",
            "Expectation Failed",
            ""))
        catList.add(CatItems(
            "${text}418",
            "Im a teapot",
            ""))
        catList.add(CatItems(
            "${text}420",
            "Enhance Your Calm",
            ""))
        catList.add(CatItems(
            "${text}421",
            "Misdirected Request",
            ""))
        return catList


    }
}