export function needsLicense(kind) {
  if (kind == 'car' || kind == 'truck') {
    return true
  }
  return false
}

export function chooseVehicle(option1, option2) {
  const betterOption = option1 < option2 ? option1 : option2;
  return `${betterOption} is clearly the better choice.`;
}

export function calculateResellPrice(originalPrice, age) {
  if (age > 10) {
    return originalPrice * 0.5;
  } else if (age >= 3) {
    return originalPrice * 0.7;
  } else {
    return originalPrice * 0.8;
  }
}
