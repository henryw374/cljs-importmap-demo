dist: 
			rm -rf dist && mkdir dist && cp -r resources/public/* dist && cp -r web-target/public/* dist
test-cljs-shadow:
			clojure -Adev -X com.widdindustries.tiado-cljs2/tests-ci-shadow :compile-mode :release
.PHONY: list
list:
		@$(MAKE) -pRrq -f $(lastword $(MAKEFILE_LIST)) : 2>/dev/null | awk -v RS= -F: '/^# File/,/^# Finished Make data base/ {if ($$1 !~ "^[#.]") {print $$1}}' | sort | egrep -v -e '^[^[:alnum:]]' -e '^$@$$' | xargs
