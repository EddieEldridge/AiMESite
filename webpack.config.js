var path = require('path');

module.exports = {
    entry: './src/main/js/app.js',
    devtool: 'sourcemaps',
    cache: true,
    mode: 'development',
    output: {
        path: __dirname,
        filename: './src/main/resources/static/built/bundle.js'
    },
    devServer: {
        historyApiFallback: true,
        hot: true
    },
    module: {
        rules: [
            {
                test: path.join(__dirname, '.'),
                exclude: /(node_modules)/,
                use: [{
                    loader: 'babel-loader',
                    options: {
                        presets: ["@babel/preset-env", "@babel/preset-react"]
                    }
                }]
            },
            {
                   test: /\.(css|less)$/,
                   use: ["style-loader", "css-loader"]
            },
            { 
                test: /\.(png|woff|woff2|eot|ttf|svg|gif)$/, 
                exclude: /(node_modules)/,
                loader: 'url-loader',
                options: {
                    publicPath: './font/',
                    name: '[name].[ext]',
                    limit: 1000
                }
            }
        ]
    }
};