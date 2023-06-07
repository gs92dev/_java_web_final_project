//Getting the elements
const form = document.getElementById("form");
const city = form.city;
const country = form.country;
const population = form.population;
const cities = document.getElementById("citiesContainer");

//Function Async Await to fetch the API
async function fetchCities() {
  const response = await fetch("/api");
  const city = await response.json();
  await city.forEach((city) => {
    let paragraph = document.createElement("p");
    cities.append(paragraph);
    paragraph.innerHTML = `${city.name},  ${city.country}, ${city.population} million`;
  });
}
//call the fetch the first time
fetchCities();
//Post Method
const url = "http://localhost:8080/api";
form.onsubmit = (event) => {
  event.preventDefault();
  console.log(city.value + country.value + population.value);
  fetch(url, {
    method: "POST",
    body: JSON.stringify({
      name: city.value,
      country: country.value,
      population: population.value,
    }),
    headers: {
      "Content-type": "application/json; charset=UTF-8",
    },
  });
  console.log(fetch.response);
  cities.innerHTML = "";
  fetchCities();
  cities.value = "";
  country.value = "";
  population.value = "";
};
