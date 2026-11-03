def hasDuplicate(transactionIds):
    seen = set()

    for id in transactionIds:
        if (id in seen):
            return True

        seen.add(id)

    return False


print(hasDuplicate(["TXN1001", "TXN1002", "TXN1003", "TXN1002", "TXN1004"]))
print(hasDuplicate(["TXN2001", "TXN2002", "TXN2003"]))