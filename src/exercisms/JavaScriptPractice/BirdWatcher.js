// @ts-check

/**
 * Calculates the total bird count.
 * @param {number[]} birdsPerDay
 * @returns {number}
 */
export function totalBirdCount(birdsPerDay) {
  let sum = 0;
  for (let i = 0; i < birdsPerDay.length; i++) {
    sum += birdsPerDay[i];
  }
  return sum;
}

/**
 * Calculates the total number of birds seen in a specific week.
 * @param {number[]} birdsPerDay
 * @param {number} week
 * @returns {number}
 */
export function birdsInWeek(birdsPerDay, week) {
  let sum = 0;
  let start = (week - 1) * 7;
  let end = start + 7;
  for (let i = start; i < end && i < birdsPerDay.length; i++) {
    sum += birdsPerDay[i];
  }
  return sum;
}

/**
 * Fixes the counting mistake by increasing bird count on every second day.
 * @param {number[]} birdsPerDay
 * @returns {number[]}
 */
export function fixBirdCountLog(birdsPerDay) {
  for (let i = 0; i < birdsPerDay.length; i += 2) {
    birdsPerDay[i] += 1;
  }
  return birdsPerDay;
}
