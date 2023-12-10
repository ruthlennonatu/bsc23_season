"""These are the tests that are automatically kicked off by Selenium
"""



from selenium_python import verify_reach_homepage
import pytest, pydoc

'''
This is part of the pytest suite we have implemented for
our DevOps pipeline, it tests the expected results upon reaching the home page
We would expect one failure and two passes here.
'''
def pydoc_gen():
    documentation = pydoc.writedoc("test_entry_pass")
    print(documentation)

class TestClass:
    """Testing the pydoc module
    
    """
    # we should pass
    def test_entry_bad(value):
        text = "No hello world here"
        assert verify_reach_homepage("No hello world here") == "We are not getting to the homepage"

    # we should get a failure back
    def test_entry_fail(value):
        text = "Hm"
        assert verify_reach_homepage("Hm") == "We are not getting to the homepage"

    # we should get a pass as we have given the expected test for reaching the home page
    def test_entry_pass(value):
        text = "Hello World!"
        assert verify_reach_homepage(text) == "We can confirm we are reaching the homepage"

if __name__ == "__main__":
    TestClass.test_entry_pass()