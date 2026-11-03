def buildLookup(records):
    lookup = {}

    for id, department in records:
        lookup[id] = department

    return lookup


def getDepartment(lookup, employeeId):
    return lookup.get(employeeId, "Unknown")


records = [
    ("E245", "Finance"),
    ("E110", "Engineering"),
    ("E390", "Marketing"),
    ("E101", "Engineering")
]

lookup = buildLookup(records)

print(getDepartment(lookup, "E390"))
print(getDepartment(lookup, "E999"))