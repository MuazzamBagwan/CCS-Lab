import hashlib
msg ="Hello There"
result = hashlib.sha256(msg.encode())
print("Output is : ", end ="")
print(result.hexdigest())
