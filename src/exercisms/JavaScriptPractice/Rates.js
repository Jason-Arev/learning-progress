export function dayRate(ratePerHour) {
  return ratePerHour * 8
}


export function daysInBudget(budget, ratePerHour) {
  return Math.floor(budget / dayRate(ratePerHour))
}

export function priceWithMonthlyDiscount(ratePerHour, numDays, discount) {
  const fullMonths = Math.floor(numDays / 22);
  const remainingDays = numDays % 22;

  const discountedMonthlyPrice = 22 * dayRate(ratePerHour) * (1 - discount);
  const fullPriceForRemainingDays = remainingDays * dayRate(ratePerHour);

  const total = (fullMonths * discountedMonthlyPrice) + fullPriceForRemainingDays;

  return Math.ceil(total);
}
