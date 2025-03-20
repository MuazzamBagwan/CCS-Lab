import hashlib
msg ="Hello There"
result = hashlib.sha1(msg.encode())
print("Output is : ", end ="")
print(result.hexdigest())
