

from selenium_python import verify_reach_homepage
import pytest

'''
This is part of the pytest suite we have implemented for
our DevOps pipeline, it tests the expected results upon reaching the home page
We would expect one failure and two passes here.
'''
class TestClass:

    # we should pass
    def test_entry_bad(value):
        text = "No hello world here"
        assert verify_reach_homepage(text) == "We are not getting to homepage"

    # we should get a failure back
    def test_entry_fail(value):
        text = "Hm"
        assert verify_reach_homepage(text) == "We can confirm we are reaching the homepage"

    # we should get a pass as we have given the expected test for reaching the home page
    def test_entry_pass(value):
        text = "Hello World!"
        assert verify_reach_homepage(text) == "We can confirm we are reaching the homepage"