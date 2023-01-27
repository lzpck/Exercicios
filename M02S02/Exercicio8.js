let result = document.getElementById("result");
      for (let i = 0; i <= 10; i++) {
        let item = document.createElement("li");
        item.innerHTML = `5 x ${i} = ${5 * i}`;
        result.appendChild(item);
      }