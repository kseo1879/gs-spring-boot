const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  webServer: {
    proxy: 'http://localhost:3000'
  }
})
