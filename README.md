# boot-template-om-next

A simple boot project template for an Om Next app. Simply clone, update the
project name and dependencies and start working.

## Structure

* `build.boot` contains the project definition and build tasks
* `LICENSE` contains the project license (AGPL3 by default)
* `resources` contains HTML, LESS and ClojureScript EDN files
* `src` contains ClojureScript sources
* `src/app` contains the source code for the app itself
* `src/app/components` contains Om Next components
* `src/app/parsing` contains Om Next `read` and `mutate` implementations
* `src/dev` contains sources for development
* `src/dev/devcards` contains devcards used during development

## Build tasks

* `boot run-development` starts the app in development mode
* `boot run-production` starts the app in production mode, with advanced
  optimizations
* `boot build-development` compiles the CLJS/LESS sources to JS/CSS, with
  source maps and no optimizations
* `boot build-production` compiles the CLJS/LESS sources to JS/CSS for
  production, with advanced optimizations

## Launching the app or devcards

When running the app in development or production mode, it can be launched
in the browser via the following URL:

    http://localhost:3000

The devcards can be viewed via

    http://localhost:3000/devcards.html

## License

This template is licensed under the GNU Affero General Public License
Version 3.
