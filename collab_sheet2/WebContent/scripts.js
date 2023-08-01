/**
 * 
 */

function populateSecondDropdown() {
    const firstDropdown = document.getElementById("first-dropdown");
    const secondDropdown = document.getElementById("second-dropdown");
    const selectedCountry = firstDropdown.value;

    // Clear the second dropdown options
    secondDropdown.innerHTML = "";

    if (selectedCountry === "usa") {
        addOption(secondDropdown, "newyork", "New York");
        addOption(secondDropdown, "losangeles", "Los Angeles");
        addOption(secondDropdown, "chicago", "Chicago");
    } else if (selectedCountry === "canada") {
        addOption(secondDropdown, "toronto", "Toronto");
        addOption(secondDropdown, "vancouver", "Vancouver");
        addOption(secondDropdown, "montreal", "Montreal");
    } else if (selectedCountry === "uk") {
        addOption(secondDropdown, "london", "London");
        addOption(secondDropdown, "manchester", "Manchester");
        addOption(secondDropdown, "birmingham", "Birmingham");
    }
}

function addOption(selectElement, value, text) {
    const option = document.createElement("option");
    option.value = value;
    option.text = text;
    selectElement.add(option);
}

// Populate the second dropdown initially when the page loads
populateSecondDropdown();