def warehouseSummary(grid):
    total = 0
    maximum = -1
    position = (0, 0)

    for i in range(len(grid)):
        for j in range(len(grid[i])):
            total += grid[i][j]

            if (grid[i][j] > maximum):
                maximum = grid[i][j]
                position = (i, j)

    return total, position


grid = [
    [4, 9, 2],
    [7, 1, 6],
    [3, 12, 5]
]

total, position = warehouseSummary(grid)

print("Total =", total)
print("Maximum Coordinate =", position)