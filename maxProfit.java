def maxProfit(prices):
    minimum = prices[0]
    profit = 0

    for price in prices:
        if (price < minimum):
            minimum = price

        currentProfit = price - minimum

        if (currentProfit > profit):
            profit = currentProfit

    return profit


print(maxProfit([7, 1, 5, 3, 6, 4]))
print(maxProfit([7, 6, 4, 3, 1]))