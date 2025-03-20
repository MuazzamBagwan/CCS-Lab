import hashlib
msg ="Hello There"
result = hashlib.md5(msg.encode())
print("Output is : ", end ="")
print(result.hexdigest())
