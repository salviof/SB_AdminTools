#!/bin/bash
pastaXHTMLS=../moduloWeb/src/main/resources/META-INF/resources/site
pastaMBPaginas=../moduloWeb/src/main/java/com/super_bits/modulos/paginas
rm $pastaMBPaginas -r
mkdir -p $pastaXHTMLS
mkdir -p $pastaMBPaginas
rsync -Cravzp --exclude='*/.git' --exclude='*/target' src/main/webapp/site/modulos  $pastaXHTMLS
rsync -Cravzp --exclude='*/.git' --exclude='*/target' src/main/java/com/super_bits/modulos/paginas/ $pastaMBPaginas
cd ../moduloWeb/
mvn clean install


