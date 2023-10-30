/** @type {import('tailwindcss').Config} */
export default {
  content: ["./index.html", "./src/**/*.{js,ts,jsx,tsx}"],
  theme: {
    extend: {
      backgroundImage: {
        "home-office":  "url('./src/main/static/public/homeOF.jpg')",
      },
    },
  },
  plugins: [],
};

