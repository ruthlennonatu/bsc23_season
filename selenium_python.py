'''
This is to check the function works.
'''

def verify_reach_homepage(text: str):
    if "Hello World!" in text:
        return "We can confirm we are reaching the homepage"
    else:
        return "We are not getting to the homepage"