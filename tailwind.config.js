/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    './src/**/*.{js,ts,jsx,tsx}', // Aponta para os arquivos no diretório 'src'
    './pages/**/*.{js,ts,jsx,tsx}', // Aponta para os arquivos no diretório 'pages'
    './components/**/*.{js,ts,jsx,tsx}', // Aponta para os arquivos no diretório 'components'
  ],
  theme: {
    extend: {},
  },
  plugins: [],
};
