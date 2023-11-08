dist: 
			rm -rf docs && mkdir docs && cp -r resources/public/* docs && cp -r web-target/public/cljs-importmap-demo/* docs
test-cljs-shadow:
			clojure -Adev -X com.widdindustries.tiado-cljs2/tests-ci-shadow :compile-mode :release
.PHONY: list
list:
		@$(MAKE) -pRrq -f $(lastword $(MAKEFILE_LIST)) : 2>/dev/null | awk -v RS= -F: '/^# File/,/^# Finished Make data base/ {if ($$1 !~ "^[#.]") {print $$1}}' | sort | egrep -v -e '^[^[:alnum:]]' -e '^$@$$' | xargs
