const format = /[A-Za-z]+\d{0,3}/;
 const ucidList = ["smd26", "mpl26", "th9", "ppd34", "rad7","mom6"];

function ucidChecker() {
                var input = document.getElementById("ucid").value;

                if (format.test(input)) {
                    if (ucidList.includes(input)) {
                        alert("VALID UCID FORMAT AND UCID FOUND");
                    } else {
                        alert("VALID UCID FORMAT BUT INVALID UCID");
                    }
                } else {
                    alert("UCID DOES NOT CONFORM TO VALID FORMAT, TRY AGAIN");
                }
            }